def call(Map args = [:]) {
    def goals = args.get('goals', 'clean package')
    def mavenOpts = args.get('mavenOpts', '')
    def mavenHome = args.get('mavenHome', '/opt/maven')

    // Run the Maven goals using a direct shell command
    sh "${mavenHome}/bin/mvn ${mavenOpts} ${goals}"
}
