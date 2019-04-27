/**
 * Copyright (C) 2019-2025 Braisdom Wang (www.joowing.com)
 * wangyonghe@msn.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.braisdom.excel;

/**
 * Declaring the elements of TemplateExcel template language.
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
     * @param value a string value of element
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
