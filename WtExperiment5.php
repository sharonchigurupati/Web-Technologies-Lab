<br><br>
<form action="">
Enter a String : <input type= "text" name = "string"><br><br>
Enter a SubString : <input type= "text" name = "sub"><br><br>

<input type = "submit"  ><br>
</form>
<?php
$s = $_GET["string"];
$t=$_GET["sub"];
echo "Current string : ",$s,"<br>";
echo "Length of the string : ",strlen($s),"<br>";
echo "Word count of the given string : ",str_word_count($s),"<br>";
echo " Reverse of the string : ",strrev($s),"<br>";
echo "Position of a substring : ",strpos($s,$t),"<br>";

?>