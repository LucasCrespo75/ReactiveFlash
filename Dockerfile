FROM gradle:8.5-jdk17

RUN apt-get update && apt-get install -qq -y --no-install-recommends

ENV INSTALL_PATH /reactive-flashCard

RUN mkdir $INSTALL_PATH

WORKDIR $INSTALL_PATH

COPY . .


