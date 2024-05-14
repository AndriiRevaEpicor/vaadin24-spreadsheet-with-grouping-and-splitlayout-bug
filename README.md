# vaadin24-spreadsheet-with-grouping-and-splitlayout-bug

This project reveals an issue when we use `SplitLayout` with primary component as `Spreadsheet`
(Excel file with grouping) and other second one as random component (in our case is Button).

Project's skeleton was got from https://start.vaadin.com/app and used `Flow/Java` - `Java` - `Maven` - `Spring Boot`.

JDK was used as `Eclipse Temurin (AdoptOpenJDK HotSpot) 21.0.3`

## Describe of the issue

Was used next Vaadin's version for test:
* Vaadin 24.3.12 with Spring Boot - `com.vaadin:vaadin-spring-boot-starter:24.3.12`
* Spreadsheet component 24.3.12   - `com.vaadin:vaadin-spreadsheet-flow:24.3.12`

When we want to use `SplitLayout` when `Spreadsheet` is primary component and some of another component will be
as second component, and we want to use `Excel file` as complex Spreadsheet (bunch of data with some of frozen rows)
with `grouping behavior` and a  then after we clicked on the collapse/expand button all rows except frozen rows
become invisible.

If we try to click on collapse/expand button again the issue won't disappear.

Also, this bug reproduces when we move splitter closer to the spreadsheet (left) side and then click on collapse/expand
button.

Temp workaround is, after refresh the browser tab to reset broken state, move splitter closer to
opposite of the spreadsheet (right) side and after that after click on the collapse/expand button spreadsheet
won't break.

NOTE: the same behavior was noticed on Vaadin 8.24.0 and Spreadsheet addon 2.1.1
(`HorizontalSplitPanel` with Spreadsheet as first component),
(`com.vaadin:vaadin-spreadsheet:2.1.1-dspanel` / `com.vaadin:vaadin-spreadsheet:2.1.1`)

## Running the Application
Just run the `Application` class directly from your IDE.

After the application has started, you can view your it at http://localhost:8080/ in your browser.
