package inperson;

public class Accountant {
    public String settleSalary(Employee employee) {
        String resp = "No se pudo liquidar el sueldo.";
        double salary = calculateSalary(employee);
        if (salary>0){
            String bill = issueSalaryReceipt(employee);
            resp = bill + "Sueldo a liquidar: " + salary;
        }
        return resp;

    }

    public String depositSalary(Employee employee) {
        return "Orden de pago al colaborador: ";
    }

}
