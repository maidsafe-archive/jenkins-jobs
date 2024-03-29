pipelineJob('ami_build-rust_slave_windows') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe-build-infrastructure.git')
    }

    description('Creates a Windows slave with the latest stable version of Rust')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('ami_build-rust_slave_windows/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('ami_build-safe_auth_cli_slave') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe-build-infrastructure.git')
    }

    description('Creates a Docker slave AMI for safe-authenticator-cli')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('ami_build-safe_auth_cli_slave/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('ami_build-safe_api_slave') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe-build-infrastructure.git')
    }

    description('Creates a Docker slave AMI for safe-api')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('ami_build-safe_api_slave/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('ami_build-safe_client_libs_slave') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe-build-infrastructure.git')
    }

    description('Creates a Docker slave AMI for safe_client_libs')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('ami_build-safe_client_libs_slave/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('ami_build-safe_nd_slave') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe-build-infrastructure.git')
    }

    description('Creates a Docker slave AMI for safe-nd')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('ami_build-safe_nd_slave/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('ami_build-safe_vault_slave') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe-build-infrastructure.git')
    }

    description('Creates a Docker slave AMI for safe_vault')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('ami_build-safe_vault_slave/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('docker_build-safe_auth_cli_build_container') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe-authenticator-cli.git')
    }

    description('Builds and pushes the container for safe-authenticator-cli')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('docker_build-safe_auth_cli_build_container/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('docker_build-safe_api_build_container') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe-api.git')
    }

    description('Builds and pushes the container for safe-api')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('docker_build-safe_api_build_container/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('docker_build-safe_client_libs_build_container') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe_client_libs.git')
    }

    description('Builds and pushes the container for Safe Client Libs')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('docker_build-safe_client_libs_build_container/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('docker_build-safe_nd_build_container') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe-nd.git')
    }

    description('Builds and pushes the container for safe-nd')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('docker_build-safe_nd_build_container/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('docker_build-safe_vault_build_container') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe_vault.git')
    }

    description('Builds and pushes the container for safe_vault')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('docker_build-safe_vault_build_container/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

multibranchPipelineJob('pipeline-safe_authenticator_cli') {
    branchSources {
        github {
            checkoutCredentialsId('github_maidsafe_token_credentials')
            scanCredentialsId('github_maidsafe_token_credentials')
            repoOwner('maidsafe')
            repository('safe-authenticator-cli')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
    factory {
        workflowBranchProjectFactory {
            scriptPath('Jenkinsfile')
        }
    }
}

multibranchPipelineJob('pipeline-safe_api') {
    branchSources {
        github {
            checkoutCredentialsId('github_maidsafe_token_credentials')
            scanCredentialsId('github_maidsafe_token_credentials')
            repoOwner('maidsafe')
            repository('safe-api')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
    factory {
        workflowBranchProjectFactory {
            scriptPath('Jenkinsfile')
        }
    }
}

multibranchPipelineJob('pipeline-safe_client_libs') {
    branchSources {
        github {
            checkoutCredentialsId('github_maidsafe_token_credentials')
            scanCredentialsId('github_maidsafe_token_credentials')
            repoOwner('maidsafe')
            repository('safe_client_libs')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
    factory {
        workflowBranchProjectFactory {
            scriptPath('scripts/Jenkinsfile')
        }
    }
}

multibranchPipelineJob('pipeline-safe_nd') {
    branchSources {
        github {
            checkoutCredentialsId('github_maidsafe_token_credentials')
            scanCredentialsId('github_maidsafe_token_credentials')
            repoOwner('maidsafe')
            repository('safe-nd')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
    factory {
        workflowBranchProjectFactory {
            scriptPath('Jenkinsfile')
        }
    }
}

multibranchPipelineJob('pipeline-safe_vault') {
    branchSources {
        github {
            checkoutCredentialsId('github_maidsafe_token_credentials')
            scanCredentialsId('github_maidsafe_token_credentials')
            repoOwner('maidsafe')
            repository('safe_vault')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
    factory {
        workflowBranchProjectFactory {
            scriptPath('Jenkinsfile')
        }
    }
}

pipelineJob('pipeline-sandbox') {
    description('Use this project as a test bed for experimentation')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins_sample_lib.git') }
                    branches('master')
                    scriptPath('Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('rust_cache_build-safe_auth_cli-windows') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe-authenticator-cli.git')
        stringParam('S3_BUCKET', 'safe-jenkins-build-artifacts')
    }

    description('Builds safe-authenticator-cli on Windows then uploads the target directory for use as a cache.')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('rust_cache_build-safe_auth_cli-windows/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('rust_cache_build-safe_api') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe-api.git')
        stringParam('S3_BUCKET', 'safe-jenkins-build-artifacts')
    }

    description('Builds safe-api on Windows and macOS then uploads the target directory for use as a cache.')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('rust_cache_build-safe_api/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('rust_cache_build-safe_client_libs-windows') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe_client_libs.git')
        stringParam('S3_BUCKET', 'safe-jenkins-build-artifacts')
    }

    description('Builds Safe Client Libs on Windows then uploads the target directory for use as a cache.')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('rust_cache_build-safe_client_libs-windows/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}

pipelineJob('rust_cache_build-safe_vault-windows') {
    parameters {
        stringParam('BRANCH', 'master')
        stringParam(
            'REPO_URL',
            'https://github.com/maidsafe/safe_vault.git')
        stringParam('S3_BUCKET', 'safe-jenkins-build-artifacts')
    }

    description('Builds Safe Vault on Windows then uploads the target directory for use as a cache.')

    definition {
        cpsScm {
            scm {
                git {
                    remote { url('https://github.com/maidsafe/jenkins-jobs.git') }
                    branches('master')
                    scriptPath('rust_cache_build-safe_vault-windows/Jenkinsfile')
                    extensions { }
                }
            }
        }
    }
}
