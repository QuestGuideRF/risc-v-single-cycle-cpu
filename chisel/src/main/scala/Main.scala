package bad
import chisel3._
import chisel3.util.Decoupled
import circt.stage.ChiselStage
object Main extends App {
  ChiselStage.emitSystemVerilogFile(new Tile())
}