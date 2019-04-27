package org.braisdom.excel;

/**
 * Declaring the elements of TemplateExcel.
 *
 * @author braisdom
 * @since 1.0.0
 */
public enum WorkbookElement {
    /** The root elements of TemplateExcel */
    WORKBOOK("workbook"),
    /** Defining a sheet of excel, there are multiple sheets in a excel */
    SHEET("sheet"),
    /** Defining a row of excel sheet */
    ROW("row"),
    /**
     * Defining a data table of sheet, the data table defines a
     * dynamic elements which generated by Java Array or List, etc.
     */
    DATA_TABLE("data-table"),
    /** The minimum of TemplateExcel, it has text, font and alignment definitions */
    CELL("cell"),
    /** The virtual tag for identifying various of row */
    HEADER("header"),
    /** The virtual tag for identifying various of row */
    BODY("body");

    private String value;

    /**
     * Create a WorkbookElement with a string value.
     * @param value
     */
    WorkbookElement(String value) {
        this.value = value;
    }

    /**
     * Returns the real value of WorkbookElement
     * @return
     */
    public String getValue() {
        return this.value;
    }
}
