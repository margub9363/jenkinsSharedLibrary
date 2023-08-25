def call(String credentialId) {
    return withCredentials([string(credentialsId: credentialId, variable: 'SECRET_VALUE')]) {
        return env.SECRET_VALUE
    }
}