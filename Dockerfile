FROM airhacks/glassfish
COPY ./target/Agora.war ${DEPLOYMENT_DIR}
