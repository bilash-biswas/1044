var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines = input.split(' ');
var a = parseInt(lines.shift());
var b = parseInt(lines.shift()); 
if(a % b === 0 || b % a === 0)
{
   console.log("Sao Multiplos");
}
else
{
   console.log("Nao sao Multiplos");
 }
