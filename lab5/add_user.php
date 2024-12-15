<?php
    session_start();
    
    $servername = "localhost";
    $username = "root";
    $password = "";
    $database = "USER_MANAGER";
    $table = "USERS";
    
    $conn = mysqli_connect($servername, $username, $password, $database);
    if ($conn->connect_error) {
        echo $conn->connect_error;
    }
    else {
        $id = mysqli_real_escape_string($conn, $_POST['id']);
        $name = mysqli_real_escape_string($conn, $_POST['name']);
        $email = mysqli_real_escape_string($conn, $_POST['email']);
        $password = mysqli_real_escape_string($conn, $_POST['password']);
        $sql_command = "INSERT INTO $table VALUES($id, '$name', '$email', '$password')";
        
        if (mysqli_query($conn, $sql_command)) {
            echo "Success";
        }
        else {
            echo mysqli_error($conn);
        }
        mysqli_close($conn);
    }
?>