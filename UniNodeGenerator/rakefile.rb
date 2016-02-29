require 'pathname'

java_src = "../src/main/java"

task :default => :gen

task :gen do
  ENV['OUTDIR'] = java_src
  load "lib/main.rb"
end

task :format_mac do
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
