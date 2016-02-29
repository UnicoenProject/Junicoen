require_relative 'dsl'
require_relative 'writer'
require_relative '../node_definition'

outdir = ENV.fetch('OUTDIR', File.dirname(__FILE__) + "../../../src/main/java")
Writer.write(Dsl.current, outdir)
