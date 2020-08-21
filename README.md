# Conekta Code Challenge

## SQL

The solution is built using a docker machine with Jupyter Notebook and Conda installed. 
This is with the purpose of having documentation inside the code and to have a better
understanding of all the stages.

In order to run the code, please follow the instructions listed below:

## Method 1 (If you don't have docker installed or Conda with Jupyter Notebooks)

Install Docker 
```
sudo apt-get update

sudo apt-get install \
    apt-transport-https \
    ca-certificates \
    curl \
    gnupg-agent \
    software-properties-common
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -

sudo apt-key fingerprint 0EBFCD88

sudo add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/ubuntu \
   $(lsb_release -cs) \
   stable"

sudo apt-get update

sudo apt-get install docker-ce docker-ce-cli containerd.io

sudo groupadd docker

sudo usermod -aG docker $USER

newgrp docker 
```

After the installation you can run the Jupyter Notebook without needing to install Conda in your computer.
First of all you need to build your new Docker image using the SQL/Dockerfile file in this repository:
```
docker build -t conekta .

# Verify that the image has been built
docker images

# You should see a list of images with one of them named conekta
```

Run the image in a container

```
docker run -it -e GRANT_SUDO=yes --user root -p 8888:8888 --name=challenge conekta
```

You will be prompted an output like this:

```
Set username to: jovyan
usermod: no changes
Granting jovyan sudo access and appending /opt/conda/bin to sudo PATH
Executing the command: jupyter notebook
[I 07:25:31.728 NotebookApp] Writing notebook server cookie secret to /home/jovyan/.local/share/jupyter/runtime/notebook_cookie_secret
[I 07:25:32.350 NotebookApp] JupyterLab extension loaded from /opt/conda/lib/python3.8/site-packages/jupyterlab
[I 07:25:32.350 NotebookApp] JupyterLab application directory is /opt/conda/share/jupyter/lab
[I 07:25:32.354 NotebookApp] Serving notebooks from local directory: /home/jovyan/work
[I 07:25:32.354 NotebookApp] The Jupyter Notebook is running at:
[I 07:25:32.354 NotebookApp] http://7d843798cc24:8888/?token=e9d155f5dba4937e4c52ee444b8b9874accd8f9f75d9d3cb
[I 07:25:32.354 NotebookApp]  or http://127.0.0.1:8888/?token=e9d155f5dba4937e4c52ee444b8b9874accd8f9f75d9d3cb
[I 07:25:32.354 NotebookApp] Use Control-C to stop this server and shut down all kernels (twice to skip confirmation).
[C 07:25:32.358 NotebookApp] 
    
    To access the notebook, open this file in a browser:
        file:///home/jovyan/.local/share/jupyter/runtime/nbserver-14-open.html
    Or copy and paste one of these URLs:
        http://7d843798cc24:8888/?token=e9d155f5dba4937e4c52ee444b8b9874accd8f9f75d9d3cb
     or http://127.0.0.1:8888/?token=e9d155f5dba4937e4c52ee444b8b9874accd8f9f75d9d3cb
```
Please open the last link (http://127.0.0.1......) in your browser.

Now you can run the code using a Jupyter Notebook!

## Method 2 (if you have Conda installed on your computer)

Start a Conda environment on your terminal and run:

```
jupyter notebook Conekta.ipynb
```

Run the code!


--------------------------------

# Scala

For the Scala part of the project it is very important to have Scala and SBT installed on you computer.
To run the code, just do the following:

```
cd conekta
sbt

# When prompted run:
run
```
That's everything you have to do with your Scala code!
