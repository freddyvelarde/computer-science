cmake_minimum_required(VERSION 3.10)

project(OpenGLProject)

# Find OpenGL package
find_package(OpenGL REQUIRED)

# Find GLFW package
find_package(glfw3 REQUIRED)

# Find GLEW package
find_package(GLEW REQUIRED)

# Set include directories
include_directories(${OPENGL_INCLUDE_DIRS})
include_directories(${GLEW_INCLUDE_DIRS})

# Add executable
add_executable(OpenGLProject src/main.cpp)

# Link libraries
target_link_libraries(OpenGLProject ${OPENGL_LIBRARIES} glfw GLEW::GLEW)
