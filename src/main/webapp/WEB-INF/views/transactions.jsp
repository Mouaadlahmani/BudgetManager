<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/transaction.css">
    <title>Ajouter Transaction</title>
</head>
<body>
    <form method="post" class="cardform" style="width: 26rem;">
        <!-- Name input -->
        <div data-mdb-input-init class="form-outline mb-4">
          <label class="form-label" for="form4Example1">Montant</label>
          <input type="text" id="form4Example1" class="form-control" />
        </div>
      
        <!-- Email input -->
        <div data-mdb-input-init class="form-outline mb-4">
          <label class="form-label" for="form4Example2">Date</label>
          <input type="date" id="form4Example2" class="form-control" />
        </div>

        <div data-mdb-input-init class="form-outline mb-4">
            <label class="form-label" for="form4Example2">Categorie</label>
            <input type="text" id="form4Example2" class="form-control" />
          </div>
      
        <!-- Message input -->
        <div data-mdb-input-init class="form-outline mb-4">
            <label class="form-label" for="form4Example3">Description</label>
          <textarea class="form-control" id="form4Example3" rows="4"></textarea>
        </div>
        <!-- Submit button -->
        <button data-mdb-ripple-init type="button" class="btn btn-outline-success">Send</button>
      </form>
</body>
</html>