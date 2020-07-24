# Symboleo Cloud IDE
The example of how to build the Theia-based applications with the symboleoext.

## Getting started

Install [nvm](https://github.com/creationix/nvm#install-script).

    curl -o- https://raw.githubusercontent.com/creationix/nvm/v0.33.5/install.sh | bash

Install npm and node.

    nvm install 10
    nvm use 10

Install yarn.

    npm install -g yarn

Install Gradle
    
    https://gradle.org/install/


## Building the Language Server 

First, make sure you are in the parent directory of the project

    cd language-server
    .\gradlew build
    cd ..

## Running the browser example

    yarn
    cd theia/browser-app
    yarn start

Open http://localhost:3000 in the browser.

