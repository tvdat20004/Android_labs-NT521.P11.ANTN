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
        $name = mysqli_real_escape_string($conn, $_POST['name']);
        $email = mysqli_real_escape_string($conn, $_POST['email']);
        $password = mysqli_real_escape_string($conn, $_POST['password']);
        $sql_command = "";
        
        if ($email == "") {
            $sql_command = "SELECT * FROM $table WHERE NAME = '$name' AND PASSWORD = '$password'";
        }
        else {
            $sql_command = "SELECT * FROM $table WHERE EMAIL = '$email'";
        }
        
        $result = mysqli_query($conn, $sql_command);
        if ($result) {
            $row = mysqli_num_rows($result);
            if ($row > 0) {
                echo "Success";
            }
            else {
                echo "Fail";
            }
        }
        else {
            echo mysqli_error($conn);
        }
        mysqli_close($conn);
    }
?>