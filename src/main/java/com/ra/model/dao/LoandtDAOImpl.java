package com.ra.model.dao;

import com.ra.model.entity.Loandt;
import com.ra.untils.ConnectionDatabase;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LoandtDAOImpl implements LoandtDAO{
    @Override
    public List<Loandt> findAll() {
        Connection connection= ConnectionDatabase.openConnection();
        List<Loandt>loandtList=new ArrayList<>();
        try {
            PreparedStatement statement= connection.prepareStatement("SELECT * FROM loan_data ");
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                Loandt loandt=new Loandt();
                loandt.setLoanAmnt(resultSet.getDouble("loan_amnt"));
                loandt.setTerm(resultSet.getString("term"));
                loandt.setIntRate(resultSet.getDouble("int_rate"));
                loandt.setInstallment(resultSet.getDouble("installment"));
                loandt.setGrade(resultSet.getString("grade"));
                loandt.setSubGrade(resultSet.getString("sub_grade"));
                loandt.setEmpTitle(resultSet.getString("emp_title"));
                loandt.setEmpLength(resultSet.getString("emp_length"));
                loandt.setHomeOwnership(resultSet.getString("home_ownership"));
                loandt.setAnnualInc(resultSet.getDouble("annual_inc"));
                loandt.setVirificationStatus(resultSet.getString("verification_status"));
                loandt.setIssueD(resultSet.getString("issue_d"));
                loandt.setLoanStatus(resultSet.getString("loan_status"));
                loandt.setPurpose(resultSet.getString("purpose"));
                loandt.setTitle(resultSet.getString("title"));
                loandt.setDti(resultSet.getDouble("dti"));
                loandt.setEarliest_cr_line(resultSet.getString("earliest_cr_line"));
                loandt.setOpen_acc(resultSet.getDouble("open_acc"));
                loandt.setPub_rec(resultSet.getDouble("pub_rec"));
                loandt.setRevol_bal(resultSet.getDouble("revol_bal"));
                loandt.setRevol_util(resultSet.getDouble("revol_util"));
                loandt.setTotal_acc(resultSet.getDouble("total_acc"));
                loandt.setInitial_list_status(resultSet.getString("initial_list_status"));
                loandt.setApplication_type(resultSet.getString("application_type"));
                loandt.setMort_acc(resultSet.getDouble("mort_acc"));
                loandt.setPub_rec_bankruptcies(resultSet.getDouble("pub_rec_bankruptcies"));
                loandt.setAddress(resultSet.getString("address"));
                loandtList.add(loandt);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDatabase.closeConnection(connection);
        }
        return loandtList;
    }
}
