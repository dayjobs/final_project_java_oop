#!/usr/bin/env bash
set -e

echo "Installing Linux desktop dependencies..."
sudo apt-get update -y
sudo apt-get install -y xvfb x11vnc fluxbox websockify novnc

echo "Starting virtual display server..."
Xvfb :1 -screen 0 1024x768x24 &
export DISPLAY=:1
fluxbox &

echo "Starting VNC bridge servers..."
x11vnc -display :1 -nopw -forever -shared -rfbport 5900 &
websockify --web=/usr/share/novnc 6080 localhost:5900 &

echo ""
echo "========================================="
echo "🎉 VNC GRAPHICAL DESKTOP ENVIRONMENT READY!"
echo "1. Go to your 'Ports' tab in VS Code."
echo "2. Find port 6080, right-click, set Port Visibility to 'Public'."
echo "3. Click the globe icon ('Open in Browser') for port 6080."
echo "========================================="
