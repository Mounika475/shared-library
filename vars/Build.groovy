def call(Map stageParams)
{
build([
$class: 'Build',
build 'java-hello-world-with-gradle'
])
}
