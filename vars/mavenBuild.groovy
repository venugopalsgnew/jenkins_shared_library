def call(String goals = 'clean package', String mavenOpts = '', String mavenHome = '/opt/maven') {
    // Ensure Maven home is set correctly
    withMaven(maven: mavenHome) {
        // Run the Maven goals
        sh "mvn ${mavenOpts} ${goals}"
    }
}
