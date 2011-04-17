package tv.porst.swfretools.dissector.gui.main.panels;

import tv.porst.splib.binaryparser.AsciiString;
import tv.porst.swfretools.parser.actions.as2.AS2Visitor;
import tv.porst.swfretools.parser.actions.as2.Action;
import tv.porst.swfretools.parser.actions.as2.ActionAdd;
import tv.porst.swfretools.parser.actions.as2.ActionAdd2;
import tv.porst.swfretools.parser.actions.as2.ActionAnd;
import tv.porst.swfretools.parser.actions.as2.ActionAsciiToChar;
import tv.porst.swfretools.parser.actions.as2.ActionBitAnd;
import tv.porst.swfretools.parser.actions.as2.ActionBitLShift;
import tv.porst.swfretools.parser.actions.as2.ActionBitOr;
import tv.porst.swfretools.parser.actions.as2.ActionBitRShift;
import tv.porst.swfretools.parser.actions.as2.ActionBitURShift;
import tv.porst.swfretools.parser.actions.as2.ActionBitXor;
import tv.porst.swfretools.parser.actions.as2.ActionCall;
import tv.porst.swfretools.parser.actions.as2.ActionCallFunction;
import tv.porst.swfretools.parser.actions.as2.ActionCallMethod;
import tv.porst.swfretools.parser.actions.as2.ActionCastOp;
import tv.porst.swfretools.parser.actions.as2.ActionCharToAscii;
import tv.porst.swfretools.parser.actions.as2.ActionCloneSprite;
import tv.porst.swfretools.parser.actions.as2.ActionConstantPool;
import tv.porst.swfretools.parser.actions.as2.ActionDecrement;
import tv.porst.swfretools.parser.actions.as2.ActionDefineFunction;
import tv.porst.swfretools.parser.actions.as2.ActionDefineFunction2;
import tv.porst.swfretools.parser.actions.as2.ActionDefineLocal;
import tv.porst.swfretools.parser.actions.as2.ActionDefineLocal2;
import tv.porst.swfretools.parser.actions.as2.ActionDelete;
import tv.porst.swfretools.parser.actions.as2.ActionDelete2;
import tv.porst.swfretools.parser.actions.as2.ActionDivide;
import tv.porst.swfretools.parser.actions.as2.ActionEndDrag;
import tv.porst.swfretools.parser.actions.as2.ActionEnumerate;
import tv.porst.swfretools.parser.actions.as2.ActionEnumerate2;
import tv.porst.swfretools.parser.actions.as2.ActionEquals;
import tv.porst.swfretools.parser.actions.as2.ActionEquals2;
import tv.porst.swfretools.parser.actions.as2.ActionExtends;
import tv.porst.swfretools.parser.actions.as2.ActionGetMember;
import tv.porst.swfretools.parser.actions.as2.ActionGetProperty;
import tv.porst.swfretools.parser.actions.as2.ActionGetTime;
import tv.porst.swfretools.parser.actions.as2.ActionGetURL;
import tv.porst.swfretools.parser.actions.as2.ActionGetURL2;
import tv.porst.swfretools.parser.actions.as2.ActionGetVariable;
import tv.porst.swfretools.parser.actions.as2.ActionGotoFrame;
import tv.porst.swfretools.parser.actions.as2.ActionGotoFrame2;
import tv.porst.swfretools.parser.actions.as2.ActionGotoLabel;
import tv.porst.swfretools.parser.actions.as2.ActionGreater;
import tv.porst.swfretools.parser.actions.as2.ActionIf;
import tv.porst.swfretools.parser.actions.as2.ActionImplementsOp;
import tv.porst.swfretools.parser.actions.as2.ActionIncrement;
import tv.porst.swfretools.parser.actions.as2.ActionInitArray;
import tv.porst.swfretools.parser.actions.as2.ActionInitObject;
import tv.porst.swfretools.parser.actions.as2.ActionInstanceOf;
import tv.porst.swfretools.parser.actions.as2.ActionJump;
import tv.porst.swfretools.parser.actions.as2.ActionLess;
import tv.porst.swfretools.parser.actions.as2.ActionLess2;
import tv.porst.swfretools.parser.actions.as2.ActionMBAsciiToChar;
import tv.porst.swfretools.parser.actions.as2.ActionMBCharToAscii;
import tv.porst.swfretools.parser.actions.as2.ActionMBStringExtract;
import tv.porst.swfretools.parser.actions.as2.ActionMBStringLength;
import tv.porst.swfretools.parser.actions.as2.ActionModulo;
import tv.porst.swfretools.parser.actions.as2.ActionMultiply;
import tv.porst.swfretools.parser.actions.as2.ActionNewMethod;
import tv.porst.swfretools.parser.actions.as2.ActionNewObject;
import tv.porst.swfretools.parser.actions.as2.ActionNextFrame;
import tv.porst.swfretools.parser.actions.as2.ActionNot;
import tv.porst.swfretools.parser.actions.as2.ActionOr;
import tv.porst.swfretools.parser.actions.as2.ActionSetMember;
import tv.porst.swfretools.parser.actions.as2.ActionSetProperty;
import tv.porst.swfretools.parser.actions.as2.ActionSetTarget;
import tv.porst.swfretools.parser.actions.as2.ActionSetTarget2;
import tv.porst.swfretools.parser.actions.as2.ActionSetVariable;
import tv.porst.swfretools.parser.actions.as2.ActionStackSwap;
import tv.porst.swfretools.parser.actions.as2.ActionStartDrag;
import tv.porst.swfretools.parser.actions.as2.ActionStop;
import tv.porst.swfretools.parser.actions.as2.ActionStopSounds;
import tv.porst.swfretools.parser.actions.as2.ActionStoreRegister;
import tv.porst.swfretools.parser.actions.as2.ActionStrictEquals;
import tv.porst.swfretools.parser.actions.as2.ActionStringAdd;
import tv.porst.swfretools.parser.actions.as2.ActionStringEquals;
import tv.porst.swfretools.parser.actions.as2.ActionStringExtract;
import tv.porst.swfretools.parser.actions.as2.ActionStringGreater;
import tv.porst.swfretools.parser.actions.as2.ActionStringLength;
import tv.porst.swfretools.parser.actions.as2.ActionStringLess;
import tv.porst.swfretools.parser.actions.as2.ActionSubtract;
import tv.porst.swfretools.parser.actions.as2.ActionTargetPath;
import tv.porst.swfretools.parser.actions.as2.ActionThrow;
import tv.porst.swfretools.parser.actions.as2.ActionToInteger;
import tv.porst.swfretools.parser.actions.as2.ActionToNumbers;
import tv.porst.swfretools.parser.actions.as2.ActionToString;
import tv.porst.swfretools.parser.actions.as2.ActionToggleQuality;
import tv.porst.swfretools.parser.actions.as2.ActionTrace;
import tv.porst.swfretools.parser.actions.as2.ActionTry;
import tv.porst.swfretools.parser.actions.as2.ActionTypeOf;
import tv.porst.swfretools.parser.actions.as2.ActionWaitForFrame;
import tv.porst.swfretools.parser.actions.as2.ActionWaitForFrame2;
import tv.porst.swfretools.parser.actions.as2.ActionWith;
import tv.porst.swfretools.parser.structures.ActionList;
import tv.porst.swfretools.parser.structures.StringList;

/**
 * Contains functions that turn ActionScript 2 code into a string that can
 * be displayed to the user.
 */
public final class AS2CodePrinter {

	/**
	 * Adds a simple one-mnemonic instruction to the output.
	 * 
	 * @param sb The string builder the output is appended to.
	 * @param mnemonic The instruction mnemonic.
	 */
	private static void add(final StringBuilder sb, final String mnemonic) {
		sb.append(mnemonic);
	}

	/**
	 * Adds an instruction with one argument to the output.
	 * 
	 * @param sb The string builder the output is appended to.
	 * @param mnemonic The instruction mnemonic.
	 * @param value The instruction argument value.
	 */
	private static void add(final StringBuilder sb, final String mnemonic, final long value) {
		sb.append(String.format("%s %d", mnemonic, value));
	}

	/**
	 * Adds an instruction with one argument to the output.
	 * 
	 * @param sb The string builder the output is appended to.
	 * @param mnemonic The instruction mnemonic.
	 * @param value The instruction argument value.
	 */
	private static void add(final StringBuilder sb, final String mnemonic, final String value) {
		sb.append(String.format("%s %s", mnemonic, value));
	}

	/**
	 * Adds an instruction with two arguments to the output.
	 * 
	 * @param sb The string builder the output is appended to.
	 * @param mnemonic The instruction mnemonic.
	 * @param value1 The first instruction argument value.
	 * @param value2 The second instruction argument value.
	 */
	private static void add(final StringBuilder sb, final String mnemonic, final String value1, final String value2) {
		sb.append(String.format("%s %s", mnemonic, value1, value2));
	}

	/**
	 * Adds an instruction to the output.
	 * 
	 * @param sb The string builder the output is appended to.
	 * @param instruction The instruction to add to the output.
	 */
	private static void addInstructionText(final StringBuilder sb, final Action instruction) {

		new AS2Visitor() {

			@Override
			protected void visit(final ActionAdd instruction) {
				add(sb, "Add");
			}

			@Override
			protected void visit(final ActionAdd2 instruction) {
				add(sb, "Add2");
			}

			@Override
			protected void visit(final ActionAnd instruction) {
				add(sb, "And");
			}

			@Override
			protected void visit(final ActionAsciiToChar instruction) {
				add(sb, "ASCIIToChar");
			}

			@Override
			protected void visit(final ActionBitAnd instruction) {
				add(sb, "BitAnd");
			}

			@Override
			protected void visit(final ActionBitLShift instruction) {
				add(sb, "BitLShift");
			}

			@Override
			protected void visit(final ActionBitOr instruction) {
				add(sb, "BitOr");
			}

			@Override
			protected void visit(final ActionBitRShift instruction) {
				add(sb, "BitRShift");
			}

			@Override
			protected void visit(final ActionBitURShift instruction) {
				add(sb, "BitURShift");
			}

			@Override
			protected void visit(final ActionBitXor instruction) {
				add(sb, "BitXor");
			}

			@Override
			protected void visit(final ActionCall instruction) {
				add(sb, "Call");
			}

			@Override
			protected void visit(final ActionCallFunction instruction) {
				add(sb, "CallFunction");
			}

			@Override
			protected void visit(final ActionCallMethod instruction) {
				add(sb, "CallMethod");
			}

			@Override
			protected void visit(final ActionCastOp instruction) {
				add(sb, "CastOp");
			}

			@Override
			protected void visit(final ActionCharToAscii instruction) {
				add(sb, "ChartToASCII");
			}

			@Override
			protected void visit(final ActionCloneSprite instruction) {
				add(sb, "CloneSprite");
			}

			@Override
			protected void visit(final ActionConstantPool instruction) {
				add(sb, "ConstantPool");

				final StringList strings = instruction.getConstantPool();

				for (int i = 0; i < strings.size(); i++) {
					final AsciiString string = strings.get(i);
					sb.append(String.format("%03d: %s", i, string.value()));
				}
			}

			@Override
			protected void visit(final ActionDecrement instruction) {
				add(sb, "Decrement");
			}

			@Override
			protected void visit(final ActionDefineFunction instruction) {
				add(sb, "DefineFunction");
				add(sb, " ");
				add(sb, instruction.getFunctionName().value());
				sb.append('\n');
				sb.append("{\n");
				sb.append(getCodeText(instruction.getCode()));
				sb.append("\n}");
			}

			@Override
			protected void visit(final ActionDefineFunction2 instruction) {
				add(sb, "DefineFunction2");
				add(sb, " ");
				add(sb, instruction.getFunctionName().value());
				sb.append('\n');
				sb.append("{\n");
				sb.append(getCodeText(instruction.getActionList()));
				sb.append("\n}");
			}

			@Override
			protected void visit(final ActionDefineLocal instruction) {
				add(sb, "DefineLocal");
			}

			@Override
			protected void visit(final ActionDefineLocal2 instruction) {
				add(sb, "DefineLocal2");
			}

			@Override
			protected void visit(final ActionDelete instruction) {
				add(sb, "Visit");
			}

			@Override
			protected void visit(final ActionDelete2 instruction) {
				add(sb, "Delete2");
			}

			@Override
			protected void visit(final ActionDivide instruction) {
				add(sb, "Divide");
			}

			@Override
			protected void visit(final ActionEndDrag instruction) {
				add(sb, "EndDrag");
			}

			@Override
			protected void visit(final ActionEnumerate instruction) {
				add(sb, "Enumerate");
			}

			@Override
			protected void visit(final ActionEnumerate2 instruction) {
				add(sb, "Enumerate2");
			}

			@Override
			protected void visit(final ActionEquals instruction) {
				add(sb, "Equals");
			}

			@Override
			protected void visit(final ActionEquals2 instruction) {
				add(sb, "Equals2");
			}

			@Override
			protected void visit(final ActionExtends instruction) {
				add(sb, "Extends");
			}

			@Override
			protected void visit(final ActionGetMember instruction) {
				add(sb, "GetMember");
			}

			@Override
			protected void visit(final ActionGetProperty instruction) {
				add(sb, "GetProperty");
			}

			@Override
			protected void visit(final ActionGetTime instruction) {
				add(sb, "GetTime");
			}

			@Override
			protected void visit(final ActionGetURL instruction) {
				add(sb, "GetURL", instruction.getUrlString().value(), instruction.getTargetString().value());
			}

			@Override
			protected void visit(final ActionGetURL2 instruction) {
				add(sb, "GetURL2");
			}

			@Override
			protected void visit(final ActionGetVariable instruction) {
				add(sb, "GetVariable");
			}

			@Override
			protected void visit(final ActionGotoFrame instruction) {
				add(sb, "GotoFrame", instruction.getFrame().value());
			}

			@Override
			protected void visit(final ActionGotoFrame2 instruction) {
				add(sb, "GotoFrame2");
			}

			@Override
			protected void visit(final ActionGotoLabel instruction) {
				add(sb, "GotoLabel", instruction.getLabel().value());
			}

			@Override
			protected void visit(final ActionGreater instruction) {
				add(sb, "Greater");
			}

			@Override
			protected void visit(final ActionIf instruction) {
				add(sb, "If", instruction.getBranchOffset().value());
			}

			@Override
			protected void visit(final ActionImplementsOp instruction) {
				add(sb, "ImplementsOp");
			}

			@Override
			protected void visit(final ActionIncrement instruction) {
				add(sb, "Increment");
			}

			@Override
			protected void visit(final ActionInitArray instruction) {
				add(sb, "InitArray");
			}

			@Override
			protected void visit(final ActionInitObject instruction) {
				add(sb, "InitObject");
			}

			@Override
			protected void visit(final ActionInstanceOf instruction) {
				add(sb, "InstanceOf");
			}

			@Override
			protected void visit(final ActionJump instruction) {
				add(sb, "Jump", instruction.getBranchOffset().value());
			}

			@Override
			protected void visit(final ActionLess instruction) {
				add(sb, "Less");
			}

			@Override
			protected void visit(final ActionLess2 instruction) {
				add(sb, "Less2");
			}

			@Override
			protected void visit(final ActionMBAsciiToChar instruction) {
				add(sb, "MBASCIIToChar");
			}

			@Override
			protected void visit(final ActionMBCharToAscii instruction) {
				add(sb, "MBCharToASCII");
			}

			@Override
			protected void visit(final ActionMBStringExtract instruction) {
				add(sb, "MBStringExtract");
			}

			@Override
			protected void visit(final ActionMBStringLength instruction) {
				add(sb, "MBStringLength");
			}

			@Override
			protected void visit(final ActionModulo instruction) {
				add(sb, "Modulo");
			}

			@Override
			protected void visit(final ActionMultiply instruction) {
				add(sb, "Multiply");
			}

			@Override
			protected void visit(final ActionNewMethod instruction) {
				add(sb, "NewMethod");
			}

			@Override
			protected void visit(final ActionNewObject instruction) {
				add(sb, "NewObject");
			}

			@Override
			protected void visit(final ActionNextFrame instruction) {
				add(sb, "NextFrame");
			}

			@Override
			protected void visit(final ActionNot instruction) {
				add(sb, "Not");
			}

			@Override
			protected void visit(final ActionOr instruction) {
				add(sb, "Or");
			}

			@Override
			protected void visit(final ActionSetMember instruction) {
				add(sb, "SetMember");
			}

			@Override
			protected void visit(final ActionSetProperty instruction) {
				add(sb, "SetProperty");
			}

			@Override
			protected void visit(final ActionSetTarget instruction) {
				add(sb, "SetTarget", instruction.getTargetName().value());
			}

			@Override
			protected void visit(final ActionSetTarget2 instruction) {
				add(sb, "SetTarget2");
			}

			@Override
			protected void visit(final ActionSetVariable instruction) {
				add(sb, "SetVariable");
			}

			@Override
			protected void visit(final ActionStackSwap instruction) {
				add(sb, "StackSwap");
			}

			@Override
			protected void visit(final ActionStartDrag instruction) {
				add(sb, "StartDrag");
			}

			@Override
			protected void visit(final ActionStop instruction) {
				add(sb, "Stop");
			}

			@Override
			protected void visit(final ActionStopSounds instruction) {
				add(sb, "StopSounds");
			}

			@Override
			protected void visit(final ActionStoreRegister instruction) {
				add(sb, "StoreRegister", instruction.getRegisterNumber().value());
			}

			@Override
			protected void visit(final ActionStrictEquals instruction) {
				add(sb, "StrictEquals");
			}

			@Override
			protected void visit(final ActionStringAdd instruction) {
				add(sb, "StringAdd");
			}

			@Override
			protected void visit(final ActionStringEquals instruction) {
				add(sb, "StringEquals");
			}

			@Override
			protected void visit(final ActionStringExtract instruction) {
				add(sb, "StringExtract");
			}

			@Override
			protected void visit(final ActionStringGreater instruction) {
				add(sb, "StringGreater");
			}

			@Override
			protected void visit(final ActionStringLength instruction) {
				add(sb, "StringLength");
			}

			@Override
			protected void visit(final ActionStringLess instruction) {
				add(sb, "StringLess");
			}

			@Override
			protected void visit(final ActionSubtract instruction) {
				add(sb, "Subtract");
			}

			@Override
			protected void visit(final ActionTargetPath instruction) {
				add(sb, "TargetPath");
			}

			@Override
			protected void visit(final ActionThrow instruction) {
				add(sb, "Throw");
			}

			@Override
			protected void visit(final ActionToggleQuality instruction) {
				add(sb, "ToggleQuality");
			}

			@Override
			protected void visit(final ActionToInteger instruction) {
				add(sb, "ToInteger");
			}

			@Override
			protected void visit(final ActionToNumbers instruction) {
				add(sb, "ToNumbers");
			}

			@Override
			protected void visit(final ActionToString instruction) {
				add(sb, "ToString");
			}

			@Override
			protected void visit(final ActionTrace instruction) {
				add(sb, "Trace");
			}

			@Override
			protected void visit(final ActionTry instruction) {
				add(sb, "Try");
			}

			@Override
			protected void visit(final ActionTypeOf instruction) {
				add(sb, "TypeOf");
			}

			@Override
			protected void visit(final ActionWaitForFrame instruction) {
				add(sb, "WaitForFrame", instruction.getFrame().value());
			}

			@Override
			protected void visit(final ActionWaitForFrame2 instruction) {
				add(sb, "WaitForFrame2", instruction.getSkipCount().value());
			}

			@Override
			protected void visit(final ActionWith instruction) {
				add(sb, "With");
				sb.append('\n');
				sb.append("{\n");
				sb.append(getCodeText(instruction.getActions()));
				sb.append("\n}");
			}
		}.visit(instruction);
	}

	/**
	 * Generates a printable string that represents all code in a given
	 * action list.
	 * 
	 * @param code The list that contains the ActionScript 2 code.
	 * 
	 * @return The generated ActionScript 2 code string.
	 */
	public static String getCodeText(final ActionList code) {

		if (code.size() == 0) {
			return "";
		}

		final StringBuilder sb = new StringBuilder();

		final Action firstInstruction = code.get(0);

		final int firstOffset = firstInstruction.getBitPosition();

		for (final Action instruction : code) {

			final int absoluteOffset = instruction.getBitPosition() / 8;
			final int relativeOffset = absoluteOffset - firstOffset  / 8;
			sb.append(String.format("%08X %08X  ", absoluteOffset, relativeOffset));

			addInstructionText(sb, instruction);

			sb.append('\n');
		}

		return sb.toString();
	}
}