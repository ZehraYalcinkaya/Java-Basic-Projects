@echo off
cd /d "%~dp0"
javac *.java
if %errorlevel% equ 0 (
    echo Compilation successful!
    java AttendanceList.AttendanceList
) else (
    echo Compilation failed!
    pause
)

