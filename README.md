# lambda
Small project to test Aws Lambda engine
Usage:
install aws cli 

navigate to /src/main/resource

aws lambda invoke
  --invocation-type Event 
  --function-name helder_helloworld 
  --region ap-southeast-2 
  --payload file://lambda-request.json outputfile.txt
