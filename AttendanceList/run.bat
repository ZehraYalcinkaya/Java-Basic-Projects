@echo off
cd /d "%~dp0"
javac *.java
if %errorlevel% equ 0 (
    cd ..
    java AttendanceList.AttendanceList
) else (
    echo Compilation failed!
    pause
)

