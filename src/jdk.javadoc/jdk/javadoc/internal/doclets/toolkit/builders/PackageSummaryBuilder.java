/*
 * Copyright (c) 2003, 2020, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package jdk.javadoc.internal.doclets.toolkit.builders;

import javax.lang.model.element.PackageElement;

import jdk.javadoc.internal.doclets.toolkit.Content;
import jdk.javadoc.internal.doclets.toolkit.DocFilesHandler;
import jdk.javadoc.internal.doclets.toolkit.DocletException;
import jdk.javadoc.internal.doclets.toolkit.PackageSummaryWriter;


/**
 * Builds the summary for a given package.
 *
 *  <p><b>This is NOT part of any supported API.
 *  If you write code that depends on this, you do so at your own risk.
 *  This code and its internal interfaces are subject to change or
 *  deletion without notice.</b>
 */
public class PackageSummaryBuilder extends AbstractBuilder {

    /**
     * The package being documented.
     */
    private final PackageElement packageElement;

    /**
     * The doclet specific writer that will output the result.
     */
    private final PackageSummaryWriter packageWriter;

    /**
     * Construct a new PackageSummaryBuilder.
     *
     * @param context  the build context.
     * @param pkg the package being documented.
     * @param packageWriter the doclet specific writer that will output the
     *        result.
     */
    private PackageSummaryBuilder(Context context,
            PackageElement pkg,
            PackageSummaryWriter packageWriter) {
        super(context);
        this.packageElement = pkg;
        this.packageWriter = packageWriter;
    }

    /**
     * Construct a new PackageSummaryBuilder.
     *
     * @param context  the build context.
     * @param pkg the package being documented.
     * @param packageWriter the doclet specific writer that will output the
     *        result.
     *
     * @return an instance of a PackageSummaryBuilder.
     */
    public static PackageSummaryBuilder getInstance(Context context,
            PackageElement pkg, PackageSummaryWriter packageWriter) {
        return new PackageSummaryBuilder(context, pkg, packageWriter);
    }

    /**
     * Build the package summary.
     *
     * @throws DocletException if there is a problem while building the documentation
     */
    @Override
    public void build() throws DocletException {
        if (packageWriter == null) {
            //Doclet does not support this output.
            return;
        }
        buildPackageDoc();
    }

    /**
     * Build the package documentation.
     *
     * @throws DocletException if there is a problem while building the documentation
     */
    protected void buildPackageDoc() throws DocletException {
        Content contentTree = packageWriter.getPackageHeader();

        buildContent();

        packageWriter.addPackageFooter();
        packageWriter.printDocument(contentTree);
        DocFilesHandler docFilesHandler = configuration
                .getWriterFactory()
                .getDocFilesHandler(packageElement);
        docFilesHandler.copyDocFiles();
    }

    /**
     * Build the content for the package.
     *
     * @throws DocletException if there is a problem while building the documentation
     */
    protected void buildContent() throws DocletException {
        Content packageContentTree = packageWriter.getContentHeader();

        packageWriter.addPackageSignature(packageContentTree);
        buildPackageDescription(packageContentTree);
        buildPackageTags(packageContentTree);
        buildSummary(packageContentTree);

        packageWriter.addPackageContent(packageContentTree);
    }

    /**
     * Builds the list of summaries for the different kinds of types in this package.
     *
     * @param packageContentTree the package content tree to which the summaries will
     *                           be added
     * @throws DocletException if there is a problem while building the documentation
     */
    protected void buildSummary(Content packageContentTree) throws DocletException {
        Content summariesList = packageWriter.getSummariesList();

        buildRelatedPackagesSummary(summariesList);
        buildAllClassesAndInterfacesSummary(summariesList);

        packageContentTree.add(packageWriter.getPackageSummary(summariesList));
    }

    /**
     * Builds a list of "nearby" packages (subpackages, super and sibling packages).
     *
     * @param summariesList the list of summaries to which the summary will be added
     */
    protected void buildRelatedPackagesSummary(Content summariesList) {
        packageWriter.addRelatedPackagesSummary(summariesList);
    }

    /**
     * Builds the summary for all classes and interfaces in this package.
     *
     * @param summariesList the list of summaries to which the summary will be added
     */
    protected void buildAllClassesAndInterfacesSummary(Content summariesList) {
        packageWriter.addAllClassesAndInterfacesSummary(summariesList);
    }


    /**
     * Build the description of the summary.
     *
     * @param packageContentTree the tree to which the package description will
     *                           be added
     */
    protected void buildPackageDescription(Content packageContentTree) {
        if (options.noComment()) {
            return;
        }
        packageWriter.addPackageDescription(packageContentTree);
    }

    /**
     * Build the tags of the summary.
     *
     * @param packageContentTree the tree to which the package tags will be added
     */
    protected void buildPackageTags(Content packageContentTree) {
        if (options.noComment()) {
            return;
        }
        packageWriter.addPackageTags(packageContentTree);
    }
}
