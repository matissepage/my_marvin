folder('Tools') {
        displayName('Tools')
        description('Folder for miscellaneous tools.')
}
job('Tools/clone-repository') {
    parameters {
        stringParam('GIT_REPOSITORY_URL', '', 'Git URL of the repository to clone')
    }
    steps {
        shell('git clone $GIT_REPOSITORY_URL')
    }
    wrappers {
        preBuildCleanup()
    }
}
job('Tools/SEED') {
    parameters {
        stringParam('GITHUB_NAME', '', 'GitHub repository owner/repo_name (e.g.: "EpitechIT31000/chocolatine")')
        stringParam('DISPLAY_NAME', '', 'Display name for the job')
    }
}