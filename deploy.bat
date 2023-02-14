@echo off

set /p VERSION= Enter image version:

if defined VERSION GOTO :version_arg_exists

set VERSION=latest

:version_arg_exists

echo %VERSION%

#set IMAGE=registry.ldblao.la/ebank/testProgram


set IMAGE=registry.ldblao.la/tikgithub/trustbillerrecent
#set IMAGE=hubporn.ldblao.la/billerrecent/biller
echo Building image: %IMAGE%:%VERSION%

cmd /c mvn clean dependency:tree compile package

cmd /c docker build -t %IMAGE%:%VERSION% .
cmd /c docker push %IMAGE%:%VERSION%
