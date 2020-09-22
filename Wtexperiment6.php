<?php
$a1= array(5,3,7);
$a2 = array(1,8,4);
$n1 = count($a1);
$n2 = count($a2);
$a3 = array();
for($i=0;$i<$n1;$i++){
   $a3[$i] = $a1[$i];  
}
for($i=$n1;$i<$n2+$n1;$i++){
   $a3[$i] = $a2[$i-$n2];  
}
rsort($a3);
$n3 = count($a3);
echo "Sorted Merged List: ";
for($x = 0; $x < $n3; $x++) {
  echo $a3[$x]," ";
  
}

?>