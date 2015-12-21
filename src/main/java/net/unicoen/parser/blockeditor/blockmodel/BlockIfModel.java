package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BlockIfModel extends BlockCommandModel {

	private List<BlockCommandModel> trueBlocks = new ArrayList<>();
	private List<BlockCommandModel> falseBlocks = new ArrayList<>();
	public static String GENUS_NAME = "ifelse";

	public BlockIfModel(Document document, Long id) {
		this.element = createBlockElement(document, GENUS_NAME, id, KIND);
	}

	@Override
	public List<Element> getBlockElements() {
		List<Element> elements = new ArrayList<>();

		elements.add(getElement());

		// 条件式
		elements.addAll(getSocketBlocks().get(0).getBlockElements());

		// 真ブロック
		for (BlockCommandModel model : trueBlocks) {
			if (model != null) {
				elements.addAll(model.getBlockElements());
			}
		}

		// 偽ブロック
		for (BlockCommandModel model : falseBlocks) {
			if (model != null) {
				elements.addAll(model.getBlockElements());
			}
		}

		return elements;
	}

	public void setTrueBlocks(List<BlockCommandModel> blocks) {
		this.trueBlocks = blocks;
	}

	public void setFalseBlocks(List<BlockCommandModel> blocks) {
		this.falseBlocks = blocks;
	}

}
