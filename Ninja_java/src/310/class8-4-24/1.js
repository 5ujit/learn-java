const Abc = require('http');
const saver = Abc.createServer(req,res=()=>{
  res.send("other side form the server ")
})
saver.listen(8080,()=>{
  console.log("ok now this sarver is running");
})