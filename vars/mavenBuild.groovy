def call(Map args = [:]) {
    def goals = args.get('goals', 'clean package')
    def mavenOpts = args.get('mavenOpts', '')
    def mavenHome = args.get('mavenHome', '/opt/maven/bin')

    // Ensure Maven home is set correctly
    withMaven(maven: mavenHome) {
        // Run the Maven goals
        sh "mvn ${mavenOpts} ${goals}"
    }
}
