def call(Map stageParams) {
    gitcheckout([
        $class: 'GitSCM'
        branches: [[name: stageParams.branch]]
        userRemoteConfigs: [[ url: stageParams.url]]

    ])
}