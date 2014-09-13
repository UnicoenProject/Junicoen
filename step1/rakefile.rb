task :javac do
  src_dir = "src_java"
  dst_dir = "dst_java"

  files = Dir.glob("#{src_dir}/*.java")
  mkdir_p dst_dir
  sh "pwd"
  sh "javac", "-sourcepath", src_dir, "-d", dst_dir, *files
end
