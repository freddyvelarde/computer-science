Installation:

First things first, since I'm `Arch linux` OS, I just run the next command in my terminal:

```sh
sudo pacman -Sy glfw-x11 glew
```

And to compile the code and then run it:

```sh
mkdir build
cd build
```

I use `CMake` tool to build the code, if you don't have install it, you need to

for Arch linux:

```sh
sudo pacman -Syu cmake
```

now your in /path/to/the/proyect/directory, just run:

```sh
cmake ..
```

Once the build files are generated successfully, build the project using make:

```sh
make
# and run the binaries:
./OpenGLProject
```
