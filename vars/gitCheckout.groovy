def call(String branch = 'main') {
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: 'https://github.com/venugopalsgnew/Jenkins_training.git']]
    ])
}
