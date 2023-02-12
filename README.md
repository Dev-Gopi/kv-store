# kv-store

Steps to install Memcached on Windows:

Download a stable version, in either 32-bit or 64-bit I have tested the 64-bit version.
Unzip it in some hard drive folder. For example C:\memcached
There will be memcached.exe file in the unzipped folder.
Open a command prompt (need to be opened as administrator).
Run c:\memcached\memcached.exe -d install
For start and stop run following command line

c:\memcached\memcached.exe -d start
c:\memcached\memcached.exe -d stop
