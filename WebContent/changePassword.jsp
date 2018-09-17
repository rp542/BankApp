<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<form action="changePassword" method="post">
<table>
<tr><td>Current Password</td><td><input type="password" name="currentPassword" ></td></tr>
<tr><td>New Password</td><td><input type="password" name="newPassword"></td></tr>
<tr><td>Confirm Password</td><td><input type="password" name="confirmPassword"></td></tr>
<tr><td><input type="submit" value="Change Password"></td></tr>
</table>
</form>
</html>