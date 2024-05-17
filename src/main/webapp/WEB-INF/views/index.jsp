<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Budget Maneger</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
       <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
          <a class="navbar-brand" href="index.html">
            <img src="../img/logo.png" alt="logo" height="36">
          </a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul  class="navbar-nav ms-auto">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="transaction.html">Transactions</a>
              </li>
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="budget.html">Budgets</a>
              </li>
            </ul>
        </div>
      </nav>
      
      <!-- Page Content -->
      <div class="container">
            <div class="balance mt-4">
                <h1 class="mt-4">Your Balance</h1>
                <h2 class="balanceDh">30 000 Dh</h2>
            </div>
            <div class="cards">
            <div class="card mt-4" style="width:200px">
                <img class="card-img-top" src="../img/pay.png" alt="Card image">
                <div class="card-img-overlay">
                  <a href="transactions" class="btn btn-outline-success">Ajouter Transaction</a>
                </div>
              </div>
              <div class="card mt-4" style="width:200px">
                <img class="card-img-top" src="../img/budget.png" alt="Card image">
                <div class="card-img-overlay">
                  <a href="budget.html" class="btn btn-outline-success">Ajouter un Budget</a>
                </div>
              </div>
            </div>
      </div>
</body>
</html>