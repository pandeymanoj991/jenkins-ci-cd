// pipeline{
//     agent any
//     tools {
//         maven "maven"
//     }
//
//     stages{
//          stage("scm-checkout"){
//             steps{
//                 checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/pandeymanoj991/jenkins-ci-cd.git']])
//             }
//         }
//
//         stage("Build Process"){
//             steps{
//                 script{
//                     bat 'mvn clean install'
//                 }
//             }
//         }
//
//         stage("Deploy to container"){
//             steps{
//                 deploy adapters: [tomcat9(credentialsId: 'c0dd1903-915b-4981-aba5-022dbde31392', path: '', url: 'http://localhost:9090/')], contextPath: 'jenkins-ci-cd', war: '**/*.war'
//             }
//         }
//     }
//
//     post{
//             always{
//             emailext attachLog: true,
//             body: ''' <html>
//             <body>
//                 <p>Build Status: ${BUILD_STATUS}</p>
//                 <p>Build Number: ${BUILD_NUMBER}</p>
//                 <p>Check the <a href="${BUILD_URL}">console output</a>.</p>
//             </body>
//             </html>''', mimeType: 'text/html', replyTo: 'mktechm@gmail.com', subject: 'Pipeline Status : ${BUILD_NUMBER}', to: 'mktechm@gmail.com'
//
//             }
//     }
// }