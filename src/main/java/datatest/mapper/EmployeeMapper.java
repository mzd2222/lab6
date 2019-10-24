package datatest.mapper;

import datatest.Bean.Employee;

//@Mapper或者@MapperScan扫描到容器中
public interface EmployeeMapper {

    public Employee getEmployee(Integer id);

    public void insertEmployee(Employee employee);
}
