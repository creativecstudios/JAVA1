<? php 
    include "config.php";
    $sino = $_POST("sino");
    $date = $_POST("date");
    $program_name = $_POST("program_name");
    $leetcode = $_POST("leetcode");
    $github = $_POST("github");
    $sql = "INSERT INTO spreadsheet(date,program_name,leetcode,github) VALUES('{$date}','{$program_name}','{$leetcode}','{$github}')";
    if($con->query($sql)){
        echo "data saved";
    }
?>