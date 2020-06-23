package com.capgemini.oca;

public class ReportTool extends Tool{
 public void export() {
	System.out.println("Read");
}
public static void main(String[] args) {
	Tool a1 = new ReportTool();
	Tool a2 = new Tool();
	callExport(a1);
	callExport(a2);
}
public static void callExport(Exportable e) {
	e.export();
}
}
