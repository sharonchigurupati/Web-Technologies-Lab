<br><br>
<form action="">
Enter Number between 1 to 100 : <input type= "number" name = "num"><br><br>
<input type = "submit"><br>
</form>
<?php
$start = $_GET["num"];
echo "Prime Numbers between 0 to ",$start,":<br>";
function primefun($n){
	$count = 1;
	 for($i = 2; $i<=$n/2;$i++){
      if($n % $i == 0){
		  $count =0;
	  }
}
return $count;
}
for ($x = 2; $x <= $start; $x++) {
  $r = primefun($x);
  if($r == 1){
  echo "$x<br>";
  }
 
}

?>