def call(Map args) {
    def branch = args.branch ?: 'master'
    def repoUrl = args.repoUrl

    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: "${repoUrl}"]]
    ])
}
