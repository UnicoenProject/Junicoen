require_relative 'dsl'
require_relative 'writer'
require_relative 'nodes'

outdir = ENV.fetch('OUTDIR', File.dirname(__FILE__) + "/out")
Writer.write(Dsl.current, outdir)

