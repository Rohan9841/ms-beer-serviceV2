package com.rohan.brewery.web.controller.v2;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rohan.brewery.services.v2.BeerServiceV2;
import com.rohan.brewery.web.model.v2.BeerDtoV2;

@RestController
@RequestMapping("/api/v2/beer")
public class BeerControllerV2 {

final BeerServiceV2 beerServiceV2;
	
	public BeerControllerV2(BeerServiceV2 beerServiceV2) {
		this.beerServiceV2 = beerServiceV2;
	}
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId){
		return new ResponseEntity<>(beerServiceV2.getBeerById(beerId), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<HttpHeaders> createBeer(@RequestBody BeerDtoV2 beerDtoV2){
		BeerDtoV2 savedDtoV2 = beerServiceV2.save(beerDtoV2);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", "api/v2/beer/"+savedDtoV2.getId().toString());
		return new ResponseEntity<>(headers, HttpStatus.CREATED);
	}
	
	@PutMapping("/{beerId}")
	public ResponseEntity<Void> updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDtoV2 beerDtoV2){
		beerServiceV2.updateBeer(beerId, beerDtoV2);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{beerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable("beerId") UUID beerId) {
		beerServiceV2.deleteById(beerId);
	}
}
