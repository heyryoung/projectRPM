package com.rpm.web.proxy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.rpm.web.util.Printer;

import lombok.Data;

@Data
@Lazy
@Component("pager")
public class PageProxy extends Proxy{
	private int totalCount, startRow, endRow, 
				pageCount,pageNum, pageSize, startPage, endPage,
				blockCount, blockNum, nextBlock, prevBlock;
	private boolean existPrev, existNext;
	private String search;
	private final int BLOCK_SIZE = 5;
	@Autowired private Printer printer;

	
	public void paging() {
		/* totalCount = ; */
		pageCount = (totalCount % pageSize != 0) ? (totalCount / pageSize)+1 : totalCount / pageSize;
		startRow = (pageNum-1)*pageSize;
		endRow = (pageNum==pageCount) ? totalCount -1 : startRow + pageSize -1;
		blockCount = (pageCount % BLOCK_SIZE != 0) ? (pageCount / BLOCK_SIZE)+1 : pageCount / BLOCK_SIZE;
		blockNum = (pageNum - 1) / BLOCK_SIZE;
		startPage = blockNum * BLOCK_SIZE + 1;
		endPage = ((blockNum + 1) != blockCount) ? startPage + (BLOCK_SIZE -1) : pageCount;
		existPrev = blockNum != 0;
		existNext = (blockNum + 1) != blockCount;
		nextBlock = startPage + BLOCK_SIZE;
		prevBlock = startPage - BLOCK_SIZE;
		
	}
	
	
}