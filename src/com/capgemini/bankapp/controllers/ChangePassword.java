package com.capgemini.bankapp.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.bankapp.dao.CustomerDao;
import com.capgemini.bankapp.exceptions.InsufficientBalanceException;
import com.capgemini.bankapp.model.Customer;
import com.capgemini.bankapp.service.CustomerService;


@WebServlet("/changePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ChangePassword() {
		super();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	/*
		response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerOldPassword = request.getParameter("customerOldPassword");
		String customerNewPassword = request.getParameter("customerNewPassword");
        HttpSession session = request.getSession();
        Customer c=(Customer)session.getAttribute("customer");
      try {
		CustomerDao.updatePassword(c, customerOldPassword, customerNewPassword);
	} catch (InsufficientBalanceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        }



	}
