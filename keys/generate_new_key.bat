@ECHO OFF
IF EXIST "C:\Program Files (x86)\Microsoft SDKs\Windows\v10.0A\bin\NETFX 4.6.1 Tools\sn.exe" GOTO FOUND
goto USEPATH

:FOUND
"C:\Program Files (x86)\Microsoft SDKs\Windows\v10.0A\bin\NETFX 4.6.1 Tools\sn.exe" -k %~dp0\Google.ProtocolBuffers.snk 
GOTO EXIT

:USEPATH
sn.exe -k %~dp0\Google.ProtocolBuffers.snk 
GOTO EXIT

:EXIT