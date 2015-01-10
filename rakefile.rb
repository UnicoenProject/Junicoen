require 'pathname'

java_src = "src/main/java"

task :default => :gen

task :gen do
  ENV['OUTDIR'] = java_src
  load "src/main/ruby/main.rb"
end

task :format do

  eclipse_home = Pathname.new(ENV['HOME']) + "Applications/eclipse"
  eclipse_bin = eclipse_home + "eclipse"
  eclipse_conf_dir = eclipse_home + "Eclipse.app/Contents/MacOS"
  conf_path = 
  options = [
    "-nosplash",
    "-application", "org.eclipse.jdt.core.JavaCodeFormatter",
    "-config", Dir.pwd + "/.settings/org.eclipse.jdt.core.prefs",
  ]
  
  files = Dir.glob(Dir.pwd + "/#{java_src}/**/*.java")
  sh *[eclipse_bin, *options, *files].map(&:to_s)
end

=begin
task :javaac do
  src_dir = "src_java"
  dst_dir = "dst_java"

  files = Dir.glob("#{src_dir}/**/*.java")
  mkdir_p dst_dir
  sh "pwd"
  sh "javac", "-sourcepath", src_dir, "-d", dst_dir, *files
end
=end
